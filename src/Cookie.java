public class Cookie {

    private String color;

    public Cookie(String color){
        this.color =color;;
        System.out.println(this.color);
    }

    public static void main(String[] args) {
        Cookie cookie1 = new Cookie("Green");
        Cookie cookie2 = new Cookie("Blue");
    }


}
