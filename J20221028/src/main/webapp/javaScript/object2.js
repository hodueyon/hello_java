//object2.js


document.addEventListener('DomContentLoaded', function() {
	// document.getElementById('show').innerHTML ='<p>Hello, World</p>';
	let data = [{ "id": 1, "first_name": "Celina", "last_name": "Fidilis", "email": "cfidilis0@dedecms.com", "gender": "Female", "salary": 8451 },
	{ "id": 2, "first_name": "Shamus", "last_name": "Chern", "email": "schern1@amazon.co.jp", "gender": "Male", "salary": 6870 },
	{ "id": 3, "first_name": "Kip", "last_name": "Prydie", "email": "kprydie2@ebay.co.uk", "gender": "Female", "salary": 6908 },
	{ "id": 4, "first_name": "Jeffie", "last_name": "de Glanville", "email": "jdeglanville3@google.ru", "gender": "Male", "salary": 5022 },
	{ "id": 5, "first_name": "Martie", "last_name": "Burhill", "email": "mburhill4@deviantart.com", "gender": "Male", "salary": 2524 },
	{ "id": 6, "first_name": "Lorne", "last_name": "Conquest", "email": "lconquest5@reuters.com", "gender": "Male", "salary": 9884 },
	{ "id": 7, "first_name": "Frederigo", "last_name": "Defond", "email": "fdefond6@gnu.org", "gender": "Male", "salary": 3063 },
	{ "id": 8, "first_name": "Jesus", "last_name": "Rosser", "email": "jrosser7@meetup.com", "gender": "Male", "salary": 1091 },
	{ "id": 9, "first_name": "Aguistin", "last_name": "Fairhurst", "email": "afairhurst8@loc.gov", "gender": "Male", "salary": 9226 },
	{ "id": 10, "first_name": "Alvina", "last_name": "Boomes", "email": "aboomes9@nasa.gov", "gender": "Female", "salary": 2583 }];

	//json 타입 => javascript 오브젝트.

	let result = JSON.parse(data);
	console.log(result);

	//for(string str : personList){}
	//<ul><li>obj</li></ul>
	//<div id="show"></div>
	const fields = ['id', 'first_name', 'email', 'salary'];
	let ulTag = document.createElement('ul');
	for (row of result) {
		makeList(row);
		ulTag.appendChild(makeList(row));
	}
	document.getElementById('show').appendChild(ulTag);
	function makeList(obj) {
		let liTag = document.createElement('li');
		let str = '';
		for(field of fields){
			str += `${field} : ${obj[field]}`;
		}
		let txt = document.createTextNode(`str`);
		liTag.appendChild(txt);

		return liTag;
	}
});