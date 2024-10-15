var result;
var arr = [];

function Manager(){	
	
	this.addInfo = function(){
		var name = prompt("이름");
		var tel = prompt("전화번호");
		arr.push(new phoneInfo(name, tel));
	}
	
	this.phoneList = function(){
		var list = "";
		for(var i in arr){
		 	list += arr[i].toString() + "<br>";
		}
		result.innerHTML = list;
	}
}

var m = new Manager();

window.onload = function(){
	result = document.getElementById("result");
	
	while(true){
		var menu = Number(prompt('1.입력 2.출력 3.검색 4.수정 5.삭제 6.종료'));
		
		switch (menu) {
		case 1:
			m.addInfo();
			break;
		case 2:
			m.phoneList();
			break;
		case 3:
			//m.searchPhone();
			break;
		case 4:
			//m.updatePhone();
			break;
		case 5:
			//m.deletePhone();
			break;
		case 6:
			alert("프로그램 종료");
			return;

		}
	}
}






