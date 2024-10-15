//step1
//$(function(){
//	$('#switcher-large').on('click', function(){
//		$('body').addClass('large');
//	});
//});

//step2 : Large Print -> large, Narrow Column -> narrow, 
// Default -> removeClass('');
//$(function(){
//	$('#switcher-large').on('click', function(){
//		$('body').removeClass('narrow').addClass('large');
//	});
//	$('#switcher-narrow').on('click', function(){
//		$('body').removeClass('large').addClass('narrow');
//	});
//	$('#switcher-default').on('click', function(){
//		$('body').removeClass('large').removeClass('narrow')
//	});
//});

//step3 : 클릭한 버튼만 selected 스타일이 적용되도록 하자.
//$(function(){
//	$('#switcher-large').on('click', function(){
//		$('body').removeClass('narrow').addClass('large');
//		$('.button').removeClass('selected');
//		$(this).addClass('selected');
//	});
//	$('#switcher-narrow').on('click', function(){
//		$('body').removeClass('large').addClass('narrow');
//		$('.button').removeClass('selected');
//		$(this).addClass('selected');
//	});
//	$('#switcher-default').on('click', function(){
//		$('body').removeClass('large').removeClass('narrow');
//		$('.button').removeClass('selected');
//		$(this).addClass('selected');
//	});
//});

//step4 :  selected 관련된 중복된 코드를 최적화 하자.
//$(function(){
//	$('#switcher-large').on('click', function(){
//		$('body').removeClass('narrow').addClass('large');
//	});
//	$('#switcher-narrow').on('click', function(){
//		$('body').removeClass('large').addClass('narrow');
//	});
//	$('#switcher-default').on('click', function(){
//		$('body').removeClass('large').removeClass('narrow');
//	});
//	
//	$('#switcher .button').on('click', function(){
//		$('.button').removeClass('selected');
//		$(this).addClass('selected');
//	});	
//});

//step5 :  selected 관련된 중복된 코드를 좀더 최적화 하자.
//$(function(){	
//	$('#switcher .button').on('click', function(){
//		$('.button').removeClass('selected');
//		$(this).addClass('selected');
//		$('body').removeClass();
//		
//		if(this.id == "switcher-large"){
//			$('body').addClass('large');
//		}else if(this.id = "switcher-narrow"){
//			$('body').addClass('narrow');
//		}		
//	});		
//});

//step6 : 이벤트 통합 함수  => 개별 이벤트 함수 변경  
//$(function(){	
//	$('#switcher .button').click(function(){
//		$('.button').removeClass('selected');
//		$(this).addClass('selected');
//		$('body').removeClass();
//		
//		if(this.id == "switcher-large"){
//			$('body').addClass('large');
//		}else if(this.id = "switcher-narrow"){
//			$('body').addClass('narrow');
//		}		
//	});		
//});

//step7 : hover 이벤트 주입
$(function(){
	$('#switcher .button').hover(function(){
		$(this).addClass('hover');
	}, function(){
		$(this).removeClass('hover');
	});
});

//step8 : <h3>스타일 변환기</h3> 클릭했을 때 => 버튼 3개가 화면에서 사라지게 하자.
//$(function(){	
//	$('#switcher h3').click(function(){
//		$('#switcher .button').toggleClass('hidden');
//	});
//	
//	$('#switcher .button').click(function(){
//		$('.button').removeClass('selected');
//		$(this).addClass('selected');
//		$('body').removeClass();
//		
//		if(this.id == "switcher-large"){
//			$('body').addClass('large');
//		}else if(this.id = "switcher-narrow"){
//			$('body').addClass('narrow');
//		}		
//	});		
//});

//step9 : 이벤트 버블링 방지시켜 보자.
//$(function(){	
//	$('#switcher').click(function(){
//		$('#switcher .button').toggleClass('hidden');
//	});
//	
//	$('#switcher .button').click(function(event){
//		$('.button').removeClass('selected');
//		$(this).addClass('selected');
//		$('body').removeClass();
//		
//		if(this.id == "switcher-large"){
//			$('body').addClass('large');
//		}else if(this.id = "switcher-narrow"){
//			$('body').addClass('narrow');
//		}	
//		
//		event.stopPropagation();
//	});		
//});

//step10 : on('click')으로 이벤트 발생 => off('click') 이벤트 해제
//               large, narrow 버튼을 클릭 후 버튼이 사라지는 이벤트를 해제 시켜 보자.   
$(function(){	
	$('#switcher').on('click.kosta1', function(){
		$('#switcher .button').toggleClass('hidden');
	});
	
	/*$('#switcher').on('click.kosta2', function(){
		alert("다른 이벤트 내용")
	});*/
	
	$('#switcher .button').click(function(event){
		$('.button').removeClass('selected');
		$(this).addClass('selected');
		$('body').removeClass();
		
		if(this.id == "switcher-large"){
			$('body').addClass('large');
		}else if(this.id = "switcher-narrow"){
			$('body').addClass('narrow');
		}	
		
		event.stopPropagation();
	});	
	
	$('#switcher-large, #switcher-narrow').click(function(){
		$('#switcher').off('click.kosta1');
	});
	
	//$('#switcher').trigger('click.kosta1');//이벤트를 자동으로 발생시킴
	$('#switcher').click();
});













