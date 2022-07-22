function inputId(id){
    opener.document.getElementById('memberid').value = id;
    this.close();
}

function idFormOpen(){
    window.open('idcheck','win','left=600,top=300,width=400,height=300,menubar=no');
    }