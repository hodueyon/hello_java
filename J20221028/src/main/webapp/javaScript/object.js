// object.js

let obj = {
    user_id : "park",
    user_name : "ParkIhyeon",
    user_age : 20,
    hobbies : ['먹기', '자기', '게임'],
    //메소드
    show_info : function(){
        return 'id: '+ this.user_id + ', name : ' + this.user_name //
            + ', age : ' + this.user_age;
    }
}

console.log('id : ' + obj.user_id);
console.log('name : ' + obj["user_name"]);
let field = "user_age";
console.log('age:' + obj[field]);
console.log('첫째 취미 : ' + obj.hobbies[0]);

console.log("박의 정보 " + obj.show_info());

//객체생성
function Person(name, age){
    this.name = name;
    this.age = age;

    this.showInfo = function() {
        return '이름은 ' + this.name + ', 나이는 '+ this.age;
    }
}

let p1 = new Person('박이현',20);
let p2 = new Person('유재석', 50);
let p3 = new Person('우영경', 29);

const Persons = [p1, p2, p3];
for(let i = 0; i<PermissionStatus.length; i++ ){
    console.log(persons[i].showInfo);
}

function person(name){
    this.name = name;
}
person('얼룩이');
console.log(this);
