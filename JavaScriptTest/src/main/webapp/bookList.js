//bookList.js

document.addEventListener('DOMContentLoaded', function () {
	fetch('./BookListServlet')
	.then( result => result.json())
	.then( bookListShow)
	.catch( err => console.error(err));


	function bookListShow(result){
		console.log(result);
		
	    let tbody = document.querySelector('#list');
	    result.forEach(row => {
	        tbody.append(makeTr(row));
		});

    //저장
    document.querySelector('#save').addEventListener('click',addFunc);

    //선택삭제 버튼
    document.querySelector('#delAll').addEventListener('click',delChecked);

    //한건삭제
    document.querySelectorAll('#list>tr>button').addEventListener('click',delData);
	}


//저장
function addFunc(){
    let code = document.getElementById('bookCode').value;
    let name = document.getElementById('bookName').value;
    let author = document.getElementById('author').value;
    let press = document.getElementById('press').value;
    let price = document.getElementById('price').value;
    let check = code && name && author && press && price;
    
    if(!check){
		alert('필수항목입니다.');
		return false;
	}
    
    
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
    .catch(err => console.log(err));
	
	return false;
}

//리스트에보여주기
	function addCallback(result){
		document.querySelector('#list').append(makeTr(result));
	
		 //입력칸 초기화
	    document.getElementById('bookCode').value = "";
	    document.getElementById('bookName').value = "";
	    document.getElementById('author').value = "";
	    document.getElementById('press').value = "";
	    document.getElementById('price').value = "";    	
		
	}

//makeTr(row)
	function makeTr(obj){
	    let tr = document.createElement('tr');
		tr.setAttribute('id', obj.bookCode);
		
		//체크박스
	   let td = document.createElement('td');
	   let chkBox = document.createElement('input');
	   chkBox.setAttribute("type","checkbox");
	   chkbox.addEventListener('change', function () {
				document.querySelectorAll('#list input[type="checkbox"]').forEach(function (check) {
					check.checked = chkbox.checked;
				});
			});
	   td.appendChild(chkBox);
	   tr.appendChild(td);
	   
	   //리스트
	   for(let field in obj) {
			let td = document.createElement('td');
					let txt = document.createTextNode(obj[field]);
	
					td.append(txt);
					tr.append(td);
		}
		
		//삭제버튼
		td = document.createElement('td');
		let btn = document.createElement('button');
		button.addEventListener('click', delBook);
		button.textContent = '삭제';
		td.append(button);
		tr.append(td);
	
		return tr;
		
	}

//선택 삭제
function delChecked(){	
    let trs = document.querySelectorAll('#list>table>tbody>tr');

    for(let i =0; i<trs.length; i++){
        if(trs[i].children[0].children[0].checked){
              
            let code = trs[i].id;

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
            .catch(err => console.log(err));
            
            trs[i].remove();
        }
    }
}// end of  delchecked();

//한건 삭제 
function delData(){
	let target = this.parentElement.parentElement.getAttribute('id');
    
    let data = 'bookCode='+target;

    fetch('./BookDelServlet', {
        method: 'post',
		headers: {
				    'Content-type': 'application/x-www-form-urlencoded'

				},
		body: data
    })
    .then(data => data.text())
    .then(addCallback)
    .catch(err => console.log(err));
    
    delbtn.parentElement.parentElement.remove();
}




});