
public  class Scopes {
    int x = 20;
    public static void Display(){
        char ch ='C';
        {
            int y = 20;
            System.out.println(ch);
            System.out.println("in block y :"+y);
        }

        // System.out.println(y);
    } 
    public static void main(String[] args) {
        int a = 10;   
        // Scopes obj = new Scopes();
        if(true){
            System.out.println(a);
            int b = 20;
        }
        System.out.println(a);
        Display();
    }
}