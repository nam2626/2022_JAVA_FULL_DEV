package event;

public class ClickEvent implements View.OnClickListener{

	@Override
	public void onClick(View view) {
		System.out.println(view.name + " 클릭 이벤트 발생");
	}

}
