//array1.js
fetch('data/MOCK_DATA.json')
.then( result => result.json())
.then( composeFnc)
.catch( error => console.error(error));

function composeFnc(result = []) { 
    //result= []해줘야 forEach가능. 안하면 비쥬얼스튜디오가 배열인지 몰라서 불가능.
    //급여가 5000넘는 사람들만 filter한 후에 새로운 모임 만들어잉.
    result.filter(row => row.salary > 5000)
        .map(row => {
            let team = {
                t_id : row.id,
                t_name : row.first_name + '/' + row.last_name                
            };
            team.t_mail = row.email;
            team['t_dept'] = 'Account';
            return team;
        })
        .forEach(team => console.log(team));
        
}

//Array.map() => A형식의 데이터형식을 A'로 바꿔주는..?
function mappingFnc(result = []){
    let newAry = result.map(row => {    
        let newObj = {}; //or new Object();라고 객체 선언
            newObj.user_id = row.id; 
            newObj.user_name = row.first_name + '-' + row.last_name;
            newObj.info = row.email;
            // newObj에 user_id라는 필드?만들거고, 거기는 row.id 담을게
            return newObj;
    });

    newAry.forEach(obj => console.log(obj));
}
// Array.filter() => 매개함수의 반환값이 true인 요소들만 모여서 새로운 배열 생성
function filterFnc(result = []){
    //let oddAry = 
        result.filter((row, idx) => row.salary > 5000)
                .forEach(row => console.log(row)); //이렇게 쓰면 따로 oddAry라는 변수 선언 필요 없다.
    
    //oddAry.forEach(row => console.log(row));       
}

// Array.forEach() => 반환값은 없고, 최종처리하는 기능 구현.
function showMain(result) {
    // console.log(result);
    result.forEach( (row, idx) => { //row => 매개변수 
        // console.log(row);
        if (idx % 2 == 0) {
            console.log(row.id, row.first_name, row.last_name);
        }
    });
}

function sum1(a,b){
    if(a){
        return a + 0;
    }
    if(b) {
        return 0 + b;
    }
    if(a && b){ //a,b둘다 존재한다면
        return a+b;
    }
   
}

function sum2(a =0,b =0){
    return a+b;
} 

//sum1과 sum2는 같은 식이다.

console.log(sum1(10)); 
