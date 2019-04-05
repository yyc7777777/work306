public class first {
    public static void main(String[] args) {

        //a = null;

        chu c = new chu();
        try {
            int a[] = {1,2,3,4,5};
            System.out.println(a[10]);
            int x = c.chufa(10,0);
            System.out.println(x);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("越界异常");
        }
        catch (Exception e){
            System.out.println("出错了");
        }


    }


}
class chu{
    public int chufa(int a,int b){
        return a/b;
    }
}

