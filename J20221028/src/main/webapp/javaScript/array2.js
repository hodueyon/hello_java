//array2

fetch('./MemberListServlet')
    .then(result => result.json())
    .then(listShow)
    .catch(error => console.error(error));

function listShow(data = []) {
    console.log(data);

    data.forEach(member => {
        if(member.auth == 'admin'){
            console.log(member);
        }
    })

    //권한 user인 사람들만 userGroup.
    //1) for each로 
    let userGroup = [];
    data.forEach(member => {
        if(member.responsibility = 'user'){
            userGroup.push(member); 
            //배열에 넣을때 push
            //배열에서 제거할때 pop
        }
    })

    //2) filter 사용해서 
    userGroup = data.filter(member => member.responsibility == 'user')
        
}


