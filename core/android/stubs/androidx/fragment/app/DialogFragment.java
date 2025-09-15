package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DialogFragment extends Fragment {

	public static final int STYLE_NORMAL = 0;
	public static final int STYLE_NO_TITLE = 1;
	private int mTheme = 0;
    public int getTheme() {
        return mTheme ;
    }
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return null;
	}
	

	public void setArguments(Bundle args) {
		// TODO Auto-generated method stub
		
	}
	

	public android.app.Dialog getDialog() {
		// TODO Auto-generated method stub
		return null;
	}

	public void show(FragmentManager supportFragmentManager, String tag) {
		// TODO Auto-generated method stub
		
	}
	
	public void setStyle(int style, int theme) {
		
	}
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		return null;
	}

	public void dismiss() {
		// TODO Auto-generated method stub
		
	}
}
