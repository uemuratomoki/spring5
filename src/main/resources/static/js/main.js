const pw1 = document.querySelector("#memberpw")
const pw2 = document.querySelector("#memberpw2")


function check(){
    if(pw1.value != pw2.value){
        alert("일치 안한다요")
        return false;
    }else{
        alert("일치한다오")
        return true;
    }
}


function isSame(){
    const pw11 = document.querySelector("#memberpw")
    const pw22 = document.querySelector("#memberpw2")


    if(pw11.value == pw22.value){
        document.querySelector("#same").innerHTML='<i class="fas fa-thumbs-up fa-1x"></i>';
        document.querySelector("#same").style.color='green';
    }else{
        document.querySelector("#same").innerHTML='비밀번호를 다시 입력하세요..';
        document.querySelector("#same").style.color='red';
        pw11.value=null;
        pw22.value=null;
    }
    

}



