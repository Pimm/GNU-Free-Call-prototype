package org.gnu.freecall.view;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/**
 * 
 */
public class SearchFieldWatcher implements TextWatcher {
	private final EditText editText;
	/**
	 * Whether the initial "search" text is still set.
	 */
	private boolean initialTextSet;
	public SearchFieldWatcher(EditText editText) {
		this.editText = editText;
		initialTextSet = true;
		editText.addTextChangedListener(this);
		editText.setTextColor(0xFF5F5F5F);
	}
	@Override
	public void afterTextChanged(Editable value) {	
	}
	@Override
	public void beforeTextChanged(CharSequence value, int changeStartIndex, int replacedTextLength, int replacingTextLength) {
	}
	@Override
	public void onTextChanged(CharSequence value, int changeStartIndex, int replacingTextLength, int replacedTextLength) {
		if (initialTextSet) {
			initialTextSet = false;
			editText.setTextColor(0xFF000000);
			editText.setText("");
		}
	}
}
