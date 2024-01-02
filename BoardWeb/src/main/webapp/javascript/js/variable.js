   //var: 함수레벨. , let, const: block 레벨.
   var name = 'Hwang';
   function myfunc(){

       console.log(this);
       console.log(name);
       //var는 함수 범위 내에서만 행동(?) 가능
       var name = 'Hong';
       // name = 'Hong'; 이렇게 해버릴시 함수 밖 name도 바꿔버림!(신기...)
       console.log(name);
   }
   myfunc();
   console.log(name);

   //블럭레벨
   let age = 20;
   function myfunc2(){
       let age = 22;
       console.log(age);
   }
   myfunc2();
   console.log(age);
   let obj ={
       id:     'Hong',
       age:    20,
       //show는 메소드
       show:   function(){
           console.log(this);
       }
   }
   obj.show();

   document.body.addEventListener('click',function(){
       console.log(this);
   })
   // 1.   전역영역    :   this > window
   // 2.   함수        :   window 객체.
   // 3.   객체        :   object
   // 4.   이벤트      :   이벤트 실행 대상.
   //  console.log(this);
   console.log(window);
   console.log(this);
   

   //let show = 'Hello';

   // function show(){
   //     console.log('show');
   // }

   let show = function(){
       console.log('show');
       //return undefined;
       return '반환값';
   }
   console.log(show());

   (function(){
       console.log('익명함수');
   })();

   //함수명명 규칙.

   function showMyName(){
       console.log('송강 잘생겼다');
   }
   showMyName();

   
   function showMyName1(){
       document.write('송강');
   }
   showMyName1();

   //상수선언.
   const height = 162.7;
   //height = 169;
   const friend ={
       name:'김영훈',
       phone:'010-1111'
   }
   friend.phone = '010-2222';


   // friend = {}













