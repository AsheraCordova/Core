
let cpx = require("cpx2");
let path = require("path");
const fs = require('fs-extra');
const readline = require('readline');
let projectBasePath = "../../../../../";

async function replaceRegexInFile(file, search, replace){
  let contents = fs.readFileSync(file, 'utf8')
  let replaced_contents = contents.replace(search, replace)
  fs.writeFileSync(file, replaced_contents, 'utf8')
  return true
}

async function processLineByLine(file) {
  const fileStream = fs.createReadStream(file);

  const rl = readline.createInterface({
    input: fileStream,
    crlfDelay: Infinity
  });
  // Note: we use the crlfDelay option to recognize all instances of CR LF
  // ('\r\n') in input.txt as a single line break.

  for await (const line of rl) {
    // Each line in input.txt will be successively available here as `line`.
	const words = line.split(',');
    replaceRegexInFile(projectBasePath + words[0], words[1], words[2]);
  }
}

if (process.argv[2] == 'restore') {
	const start = async () =>{
		console.log("restore android res and tsc files.....");
		cpx.copy(projectBasePath + "android_backup/res/**", "res");
		cpx.copy(projectBasePath + "android_backup/tsc/**", "tsc");
		
		if (fs.existsSync(projectBasePath + "android_backup/patch")) {
			cpx.copy(projectBasePath + "android_backup/patch/**", projectBasePath);
		}
		
		if (fs.existsSync(projectBasePath + "android_backup/patch.properties")) {
			await processLineByLine(projectBasePath + "android_backup/patch.properties");
		}
		console.log("restore android res and tsc files finished");    
	};
	start();
	
} else {
	fs.removeSync(projectBasePath + "android_backup", { recursive: true, force: true });

	console.log("backing up android res and tsc files.....");
	cpx.copy("res/**", projectBasePath + "android_backup/res");
	cpx.copy("tsc" + "/**", projectBasePath + "android_backup/tsc", {ignore : ["node_modules", "*.lock", "android", "app", "R", "navigation", "app.ts", "ErrorDetailFragment.ts", "widget", "ErrorFragment.ts", "FragmentFactory", "app.ts"]});
	console.log("backing up android res and tsc files finished");
}


