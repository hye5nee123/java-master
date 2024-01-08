<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html>

  <head>
    
      <div id="show">
        <table class="table">
          <tr>
            <th>센터id</th>
            <th>센터명</th>
            <th>연락처</th>
            <th>시도정보</th>
            <th>주소</th>
          </tr>
          <tbody id="list"></tbody>
        </table>
      </div>
      <script>
      const url = 'https://api.odcloud.kr/api/15077586/v1/centers?page=1&perPage=10&serviceKey=D4wQIJfE4%2BUW3%2BZ1cT9PArsZoTNSbHRDPlLfavFTsklZliOcWX6XaELJSJ3kfWxLARfXdLoLii0lN5uwWVYu1w%3D%3D'
      const fields = ['id', 'centerName', 'phoneNumber', 'sido']
      let tbody = document.getElementById("list");
      
      const xhtp = new XMLHttpRequest();
      xhtp.open('get', url);
      xhtp.send();
      xhtp.onload = function () {
        console.log(JSON.parse(xhtp.responseText));
        let result = JSON.parse(xhtp.responseText);
        result.data.forEach(center =>{
          console.log(center);
          let tr = document.createElement('tr');
          tr.addEventListener('click', function(){
            //location.href = 'map.do?x='+center.lat+'&y='+center.lng;
            window.open("map.do?x="+center.lat+"&y="+center.lng)
          })
          fields.forEach(field =>{
            let td = document.createElement('td');
            td.innerText = center[field]
            tr.appendChild(td);
          })
          tbody.appendChild(tr);
        })
        
      }


    </script>


  </head>

  <body>
    <div></div>
  </body>

  </html>