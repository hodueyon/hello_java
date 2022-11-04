/**
 *  dom3.js
 */
 
document.addEventListener('DOMContentLoaded',function(){;

	document.querySelector('button').addEventListener('click', function(){
		//아이디 조회해서 화면에서 삭제
		let trs = document.querySelectorAll('table>tbody>tr');
		console.log(trs[1].children[0].textContent);
		for(let i =0; i<trs.length; i++){
			if(document.getElementById("id").value==trs[i].children[0].textContent){
				trs[i].remove();
			}	
		}
			
	});
	
let tableObject = {
	id : 'kim',
	titles : ["아이디", "이름", "이메일", "삭제"],
	data : [{id: 'user1', name : '김호두', email : 'kim@email'},
			{id: 'user2',  name : '황포도', email : 'hwang@email'},
			{id: 'user3',  name : '김초코', email : 'choco@email'}],
	
	addData : function(row){
		this.data.push(row);
		//push하면 배열의 가장 마지막에 추가해줌..
	},
	makeTable:function(){
		let table = document.createElement('table');
		let thead = this.makeHead();
		let tbody = this.makeBody();
		//appendChild : 매게값 하나, append : 매게값 여러개 가능
		table.append(thead, tbody);
		return table;
	},
	
	makeHead:function(){
		let thead = document.createElement('thead');
		let tr = document.createElement('tr');
		this.titles.forEach(function(title){
			let td = document.createElement('th');
			let txt = document.createTextNode(title);
			td.append(txt);
			tr.append(td);
		})
		thead.append(tr);
		return thead;	
	},
	
	makeBody: function(){
		let tbody = document.createElement('tbody');
		this.data.forEach((val) => {
			let tr = document.createElement('tr');
			tbody.append(tr);
			for(let field in val){ //for in 기억하기
				let td = document.createElement('td');
				let txt = document.createTextNode(val[field]);
				td.append(txt);
				tr.append(td);
			}
			//삭제버튼.클릭하면 한건 삭제 
		let del = document.createElement('button');
		let td = document.createElement('td');
		del.textContent='삭제';		
		del.addEventListener('click', function(){
			del.parentElement.parentElement.remove();	
		});
		td.append(del);
		tr.append(td);
		});
		return tbody;	
	},
	
	init : function(){
		let id = 'park';
		console.log('init call.' + id);
		console.log(this.id);
		//body라는 태그를 찾아줌. 컬렉션 형태로 리턴해줌
		//getElemnetsbyTagname = 여러개 찾기때문에 한개라도 무조건 인덱스를 적어주어야 한다.
		document.getElementsByTagName('body')[0].append(this.makeTable());
	}
}
	//데이터추가
	tableObject.addData({id : 'user4', name: '우영경',email : 'yoki@email'});
	tableObject.init();

}) //end of domloadedFunc();