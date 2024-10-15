//$() => 팩토리 함수 : jQuery객체를 생성 => jQuery함수를 호출
//var obj = {} => 자바스크립트 객체
//window.onload = function(){} =>HTML문서 로딩 후 함수 호출(외부 리소스 포함)

/*$(document).ready(function(){ //외부리소스 제외 : 문서구조만 로딩
	$('.poem-stanza').addClass('highlight');
});*/

$(function(){
	$('.poem-stanza').addClass('highlight');
})