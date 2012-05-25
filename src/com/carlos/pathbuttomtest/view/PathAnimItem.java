package com.carlos.pathbuttomtest.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/**
 * @author carlos carlosk@163.com
 * @version 创建时间：2012-5-25 上午10:29:38 类说明 每一个按钮
 */

public class PathAnimItem extends ImageButton {
	private MyPoint startPoint;// 开始的点
	private MyPoint endPoint;// 结束的点
	private MyPoint nearPoint;// 近的点
	private MyPoint farPoint;// 远的点

	public PathAnimItem(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public MyPoint getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(MyPoint startPoint) {
		this.startPoint = startPoint;
	}

	public MyPoint getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(MyPoint endPoint) {
		this.endPoint = endPoint;
	}

	public MyPoint getNearPoint() {
		return nearPoint;
	}

	public void setNearPoint(MyPoint nearPoint) {
		this.nearPoint = nearPoint;
	}

	public MyPoint getFarPoint() {
		return farPoint;
	}

	public void setFarPoint(MyPoint farPoint) {
		this.farPoint = farPoint;
	}

}
