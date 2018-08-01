package com.company;

public  class MainActivity extends Activity{



    @Override
    protected void onCreate() {
        setContentView();


        Button btn_login = new Button();
//        btn_login.on(function(){
//            tv_alert("hi");
//        });



        btn_login.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("ff");
            }
        });
//
//        $("p").on("click", function(){
//            alert("The paragraph was clicked.");
//        });


        btn_login.click();
    }


}
