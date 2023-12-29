// table.js
 // for(let prop in obj1) {      }
        // table 생성.
        let tbl = document.createElement('table');
        tbl.setAttribute('border','1'); //attribute 추가
        tbl.setAttribute('id','list');
        tbl.appendChild(makeHead());
        tbl.appendChild(makeBody());
        document.querySelector('body').appendChild(tbl);
        //table 생성 end.

        //추가 버튼 클릭 이벤트.
        document.getElementById('addBtn').addEventListener('click', function(){

                                    //input tag
            let id = document.getElementById('uid').value;
            let name = document.getElementById('uname').value;
            let phone = document.getElementById('uphone').value;




            if(!id || !name || !phone){
                alert('값을 입력하세요.');
                return;
            }


            //let obj = {id: id, name: name, phone: phone}
            let obj = {id,name,phone}
            document.querySelector('#list>tbody').appendChild(makeTr(obj));

            document.getElementById('uid').value = '';
            document.getElementById('uname').value = '';
            document.getElementById('uphone').value = '';
            document.getElementById('uid').focus();
            //makeTr(obj);
        })

        //변경 버튼 누르면 클릭 이벤트 등록.

        document.querySelector('#editBtn').addEventListener('click',function(){
            let target = document.querySelectorAll('#list>tbody>tr');
            //console.log(target);
            //찾을값.
            let findId = document.getElementById('uid').value;
            let phone = document.getElementById('uphone').value;
            //찾을 대상:target.
            target.forEach(function(item,idx,ary){
                let tr = item;
                if(tr.children[0].innerText == findId){
                    tr.children[2].innerText = phone;
                }
                            })
          
        })


        //선택 삭제 이벤트 시작
        document.querySelector('#delBtn').addEventListener('click',function(){
            document.querySelectorAll('#list>tbody>tr>td>input:checked')//
            .forEach(function (item) {
                item.parentElement.parentElement.remove();
            })

        })


        
        function makeHead(){
        // thead 시작.
        let thd = document.createElement('thead');

        // tr.
        let tr = document.createElement('tr');

        // th*3.
        for(let prop in obj1) {
            let th = document.createElement('th');
            th.innerText = prop.toUpperCase();
            tr.appendChild(th);
        }

        //삭제.


        let th = document.createElement('th');
        th.innerText = '삭제';
        tr.appendChild(th);


        //선택 삭제
        th = document.createElement('th');
        th.innerText = '선택삭제';
        tr.appendChild(th);



        thd.appendChild(tr);
        return thd;
    }
    function makeBody(){
                   // tbody 시작.
        let tbd = document.createElement('tbody');
    
            for( let friend of friends) {
             tbd.appendChild(makeTr(friend));
            }
            return tbd;
    }

    //tr 부분~
        function makeTr(obj ={}){
            let trb = document.createElement('tr');
            trb.addEventListener('click',function(){
                console.log(this.children[0].innerText);
                document.getElementById('uid').value = this.children[0].innerText;
                document.getElementById('uname').value = this.children[1].innerText;
                //=document.querySelector(#uname).value = this.children[1].innerText;
                document.getElementById('uphone').value = this.children[2].innerText;
                
                        })
                    // td.
                for (let prop in obj) {
                    let td = document.createElement('td');
                    td.innerText = obj[prop];
                    trb.appendChild(td);
                }
                //삭제 버튼 생성.

                let td  = document.createElement('td');
                let btn = document.createElement('button');
                //button 이벤트 등록.
                btn.addEventListener('click',function(e){
                    //this는 항상 다른데 이번에서는 이벤트핸들러가 정의한 btn을 가르키는 중 
                    //this.parentElement > td 
                    e.stopPropagation(); //상위요소로 이벤트 전파 금지.
                    console.log(this.parentElement.parentElement.remove());
                })
                btn.innerText = '삭제';
                td.appendChild(btn);
                trb.appendChild(td);

               //체크박스 생성.
                td = document.createElement('td');
                td.setAttribute = document.createElement('input');
                let checkbox = document.createElement('input');

                //checkbox에 event 등록!
                //function(e)은 고정(event)라는 애가 매개값으로 넘어옴!

                checkbox.addEventListener('click', function(e){
                    e.stopPropagation();//상위요소로 이벤트 전파 금지.
                    console.log(e);
                })
                checkbox.setAttribute('type','checkbox');
                td.appendChild(checkbox);
                trb.appendChild(td);
            
              
               
               
                return trb;



                
    
        }

        
        

        