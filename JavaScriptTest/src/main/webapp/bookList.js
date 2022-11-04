//bookList.js
fetch('./BookListServlet')
.then( result => result.json())
.then( bookListShow)
.catch( err => console.error(err));

let data = result.data

function bookListShow(result){
	
    let data = result;
    let tbody = document.querySelector('#list');
    data.forEach(row => {
        tbody.append(makeTr(row));
    });

    //저장
    document.querySelector('#save').addEventListener('click',addFunc);

    //선택삭제 버튼
    document.querySelector('#delAll').addEventListener('click',delChecked);

    //한건삭제
    document.querySelectorAll('#list>tr>td>button').addEventListener('click',delData);
}

let titles = {
    book_code : '도서코드',
    book_name : '도서명',
    author : '작가',
    press :'출판사',
    price : '가격'
}

//저장
function addFunc(){
    let code = document.getElementById('bookCode').value;
    let name = document.getElementById('bookName').value;
    let author = document.getElementById('author').value;
    let press = document.getElementById('press').value;
    let price = document.getElementById('price').value;
    
    let data = 'bookCode='+code+ '&bookName=' + name+ '&author='+author + '&press='+press+ '&price'+price;

    fetch('./BookAddServlet', {
        method: 'post',
		headers: {
				    'Content-type': 'application/x-www-form-urlencoded'

				},
		body: data
    })
    .then(data => data.json())
    .then(addCallback)
    .catch();


    //입력칸 초기화
    document.getElementById('bookCode').value = "";
    document.getElementById('bookName').value = "";
    document.getElementById('author').value = "";
    document.getElementById('press').value = "";
    document.getElementById('price').value = "";    
}

//makeTr(row)
function makeTr(row){
    let tr = document.createElement('tr');

    for(let field in titles){
        let td = document.createElement('td');
        let ckBox = document.createElement('input');
        ckBox.setAttribute('type','checkbox');
        let txt = document.createTextNode(row[field]);
        let delbtn = document.createElement('button');
        delbtn.textContent = "삭제";
        td.append(txt, delbtn);
        tr.appendChild(td);
    }
    document.getElementById('list').append(tr);
}

//선택 삭제
function delChecked(){	
    let trs = document.querySelectorAll('#form>table>tbody>tr');
    console.log('checked');

    for(let i =0; i<trs.length; i++){
        if(trs[i].children[0].firstElementChild.checked){
            trs[i].remove();
            
            let code = trs[i].children[1];

            let data = 'bookCode='+code ;
            
            fetch('./BookDelServlet', {
                method: 'post',
                headers: {
                            'Content-type': 'application/x-www-form-urlencoded'
        
                        },
                body: data
            })
            .then(data => data.json())
            .then(addCallback)
            .catch();
        }
    }
}// end of  delchecked();

//한건 삭제 
function delData(){
    delbtn.parentElement.parentElement.remove();
    
    let code = document.getElementById('bookCode').value;

    let data = 'bookCode='+code;

    fetch('./BookDelServlet', {
        method: 'post',
		headers: {
				    'Content-type': 'application/x-www-form-urlencoded'

				},
		body: data
    })
    .then(data => data.json())
    .then(addCallback)
    .catch();
}




