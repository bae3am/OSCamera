package kr.co.octsun.oscamera.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;

import kr.co.octsun.oscamera.R;
import kr.co.octsun.oscamera.util.ScreenManager;

public class MenuIcon extends ConstraintLayout implements View.OnClickListener{

    private Context mContext;

    public MenuIcon(Context context) {
        super(context);
        this.mContext = context;

    }

    public MenuIcon(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        getAttrs(attrs);
    }

    public MenuIcon(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        getAttrs(attrs, defStyleAttr);
    }

    private void getAttrs(AttributeSet attrs){
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.MenuIcon);
        setTypeArray(typedArray);
    }

    private void getAttrs(AttributeSet attrs, int defStyleAttr){
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.MenuIcon, defStyleAttr,0);
        setTypeArray(typedArray);
    }

    private void setTypeArray(TypedArray typeArray){
        setLayoutProperty();
        typeArray.recycle();
    }

    private void setLayoutProperty(){
        setClickable(true);
        setBackgroundResource(R.drawable.shape_bg_menu_icon);
    }


    @Override
    public void onClick(View v) {

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
    {
        heightMeasureSpec = MeasureSpec.makeMeasureSpec( ScreenManager.getPixelValue(mContext, 100 ), MeasureSpec.EXACTLY);
        widthMeasureSpec = MeasureSpec.makeMeasureSpec( ScreenManager.getPixelValue(mContext, 100 ), MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
