public class App {
    static Object _obj; 

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        func1();
        func2();
        func3();
        func4();
        func5();
        func6();
        func7();
    }
    private static void func1() {
        // 以下はコンパイルエラー : can't find symbol 'NULL'
        // Object obj = NULL; 
          
        // こちらは動く。
        Object obj1 = null; 
        System.out.println("事実1: null は小文字。Case sensitive.");
    }
    private static void func2() {
        // "null" がプリントされる。
        System.out.println("事実2: どの参照変数もデフォルト値は null。Object _obj の値は : " + _obj);
    }
    private static void func3() {
        // null は String に代入できる。
        String str = null; 
        System.out.println("事実3: "+str+"は任意の型にキャストすることができる。");
    
        // Integer にも代入できる。
        Integer itr = null; 
        System.out.println("なので Integer に代入しても" + itr);

        // Double にも代入できる。
        Double dbl = null; 
        System.out.println("Double に代入しても" + dbl);
        
        // String にキャストできる。
        String myStr = (String) null; 
        System.out.println("String にキャストしても" + myStr);
    
        // Integer にキャストできる。
        Integer myItr = (Integer) null; 
        System.out.println("Integer にキャストしても" + myItr);
    
        // うん。これもキャストできる。No error
        Double myDbl = (Double) null; 
        System.out.println("Double にキャストしても" + myDbl);
    }
    private static void func4() {
        // Integer は null になりえる。
        Integer i = null;
              
        // オブジェクトを値型に戻す。Unboxing null to integer throws NullpointerException
        // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because "i" is null
        //   at App.func4(App.java:48)
        //   at App.main(App.java:7)
        
        // https://ja.wikipedia.org/wiki/ボックス化
        // https://qiita.com/chihiro/items/870eca6e911fa5cd8e58
        try {
            int a = i;
        } catch (NullPointerException e) {
            System.out.println("事実4: アンボクシング時にNullPointerException。");
            System.out.println("--------------------------------------------------------------------------------");
            e.printStackTrace();
            System.out.println("--------------------------------------------------------------------------------");
        }
    }
    private static void func5() {
        Integer i = null;
        Integer j = 10;
              
        // false がプリントされる
        System.out.println("事実5: 値がnullでなければ、instanceof演算子の結果はtrue。nullでは"); 
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(i instanceof Integer);
        System.out.println("--------------------------------------------------------------------------------");
          
        // もちろん true
        System.out.println("こちらは");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(j instanceof Integer);
        System.out.println("--------------------------------------------------------------------------------");
    }

    private static void func6(){
        App obj= null;
        obj.staticMethod();
        try {
            obj.nonStaticMethod();     
        } catch (NullPointerException e) {
            System.out.println("こちらは例外を投げる。");
            System.out.println("--------------------------------------------------------------------------------");
            e.printStackTrace();
            System.out.println("--------------------------------------------------------------------------------");
        }
    }
    private static void staticMethod(){
        System.out.println("事実6: static method。null 参照静的メソッドは、静的バインディングを使用して結合されているので、NullPointerExceptionを投げない。");
    }
          
    private void nonStaticMethod() {
        System.out.println(" Non-static method- ");
    }

    private static void func7(){
        // trueを返す。
        System.out.println("事実7: 比較演算子はnullと一緒に使うことができる。");
        System.out.println("だからこれは ");
        System.out.println(null==null);
        // falseを返す。
        System.out.println("これは ");
        System.out.println(null!=null);
    }
}
