const path = require('path');
const webpack = require('webpack');

module.exports = [{
  name: 'full',
  entry: './src/app.ts',
  module: {
    rules: [
      {
        test: /\.ts(x?)$/,
        use: [
          {
            loader: 'babel-loader',
            options: {
              presets: ['@babel/preset-env']
            }
          },
          {
            loader: 'ts-loader'
          }
        ]
      },
      {
        test: /\.m?js$/,
        use: [
          {
            loader: 'babel-loader',
            options: {
              presets: ['@babel/preset-env']
            }
          }
        ]
      }
    ]
  },
  resolve: {
    extensions: ['.ts', '.js', '.json']
  },
  output: {
    filename: 'index.js',
    path: path.resolve(__dirname, '../assets/www/js')
  },
  plugins: [
  ],
  devtool: 'cheap-module-source-map',
  //mode: "development",
  optimization: {
    // We no not want to minimize our code.
    minimize: false
  },
  devServer: {
    disableHostCheck: true,
    historyApiFallback: {
      index: "",
      verbose: true,
      disableDotRule: true
    }
  }
},

{
  name: 'child',
  entry: './src/ChildApp.ts',
  module: {
    rules: [
      {
        test: /\.ts(x?)$/,
        use: [
          {
            loader: 'babel-loader',
            options: {
              presets: ['@babel/preset-env']
            }
          },
          {
            loader: 'ts-loader'
          }
        ]
      },
      {
        test: /\.m?js$/,
        use: [
          {
            loader: 'babel-loader',
            options: {
              presets: ['@babel/preset-env']
            }
          }
        ]
      }
    ]
  },
  resolve: {
    extensions: ['.ts', '.js', '.json']
  },
  output: {
    filename: 'index_lite.js',
    path: path.resolve(__dirname, '../assets/www/js')
  },
  externals: {
    "babel-polyfill": "BabelPolyfill",
    "class-transformer": "ClassTransformer",
    "reflect-metadata": "ReflectMetadata",
    "ts-mixer": "TsMixer",
    'regenerator-runtime/runtime': 'regenerator-runtime/runtime'
  },
  plugins: [    
  ],
  externals: [
    function ({ context, request }, callback) {               
        callback();
      }
  ],
  devtool: 'cheap-module-source-map',
  //mode: 'production',
  optimization: {
    // We no not want to minimize our code.
    minimize: false
  },
}

];
