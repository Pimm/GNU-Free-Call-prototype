package org.gnu.freecall.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class PrivacySlider extends View {
	private static final int HEIGHT = 48;
	private final Paint orangePaint;
	private final Paint whiteStrokePaint;
	private int width;
	public PrivacySlider(Context context, AttributeSet attributes) {
		super(context, attributes);
		orangePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		orangePaint.setColor(0xFFFBB829);
		whiteStrokePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		whiteStrokePaint.setStyle(Paint.Style.STROKE);
		whiteStrokePaint.setColor(0xFFFFFFFF);
	}
	@Override
	protected void onDraw(Canvas canvas) {
	}
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		width = MeasureSpec.getSize(widthMeasureSpec) - getPaddingRight();
		setMeasuredDimension(width, HEIGHT);
	}
}