package event;

public class EventMain {

	public static void main(String[] args) {
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
		
		btn1.onClick();//이벤트 처리 X, 실행이 안됨
		btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				System.out.println(view.name + " 클릭 이벤트");
			}
		});
		btn1.onClick();
		btn2.setOnClickListener(new ClickEvent());
		btn2.onClick();
	}

}




