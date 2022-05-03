package event;

public class View {
	protected String name;
	private OnClickListener onClickListener;

	public View(String name) {
		this.name = name;
	}

	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}
	
	public void onClick() {
		if(onClickListener != null)
			onClickListener.onClick(this);
	}
	
	public static interface OnClickListener{
		public void onClick(View view);
	}
}



