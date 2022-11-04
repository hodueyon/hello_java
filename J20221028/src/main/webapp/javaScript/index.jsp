<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>index.jsp</title>
    <script src="object.js"></script>
</head>
<body>
    <form action="indext.html" onsubmit="submitFunc()">
        id:<input type="text" id="uid" value="user1"><br>
        pw : <input type="password" id="upw" value="1234"><br>
        <input type="submit" value="로그인">
    </form>
    <!--div#show 라고 치면 아이디가 show인 div 생성 가능.-->
    <div id="show"></div>
    <!--자바스크립트는 script 안에 작성-->
    <script>
        function saveFnc(){
            // document.write('<p>Hello, World!</p>')
            //dom요소생성.
            let pTag = document.createElement('p'); //<p></p>만든거..
            let txt = document.createTextNode('Hello,World');
            console.log(txt);
            pTag.appendChild(txt); //<p>'Hello, World'</p>
            console.log(pTag);
            
            let show = document.getElementById('show');
            show.appendChild(pTag);
            console.log(show);
            }
        

        function submitFunc(){
            event.preventDefault(); //form 기본 기능 차단
            console.log('submitFunc() call.');
        
            //element 선택하는 데 id속성으로 엘리먼트 선택(id속성은 유일?하니까 유니크함)
            let id = document.getElementById('uid').value;
            let pw = document.getElementById('upw').value;

            let pTag = document.createElement('p');
            let txt = document.createTextNode('id는' + id + ', 비번은 ' + pw);
            pTag.appendChild(txt);

            pTag.onclick = function(){
                console.log(this.remove());
            }
            document.getElementById('show').appendChild(pTag);
        }
    </script>
</body>
</html>