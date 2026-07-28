package ex03;


public class StaticSample {

    //필드
    //외부에 노출되지 않는다 = 외부에서 접근할 수 없다
    private String value;

    //생성자를 만들지 않으면 컴파일러에 의해서 기본 생성자가 만들어진다
    //생성자/메서드의 오버로딩 - 메서드의 이름은 같은데 매개변수의 갯수나 타입이 다른 경우
    //메서드/생성자의 선언부는 중복될 수 없다
    public StaticSample(){
        value="";
    }

    //setter , getter 메서드
    //필드의 접근 제한자가 private인 경우 , 
    // setter , getter 메서드를 통해 필드의 값을 변경하거나 가지고 갈 수 있도록 해준다
    //setter

    /**
     * StaticSample의 value속성을 매개변수로 받아온 값으로 설정한다
     * @param value 
     * 
     * */ 

    public void setValue(String value) {
        //외부에서 입력딘 값이 변경가능한 값인지 체크
        if(value.equals("일반")|| value.equals("고속")){
            this.value = value;
        }
    }
    /**
     * StaticSample의 value속성의 값을 반환한다.
     * @return
     */

    public String getValue() {
        return value;
    }

    //메서드
    public void toUpper(){

    }

    public void setChar(int index , char c){

    }
    
    public int valueLength(){
        return 0;
    }

    // 반환타입을 지정하면 return 문장이 있어야 한다 !!!
    public String valueConcat(String str) {
        return "";
    }

    //메서드 재정의 - 부모가 가진 메서드를 자식이 다시 정의하는 것
    // 메서드의 선언부는 바뀌지 않는다
    @Override
    public String toString() {
        return value;
    }

}

    
