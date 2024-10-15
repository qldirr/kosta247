$(function(){
	var $speech = $('div.speech');
	var defaultSize = parseInt($speech.css('fontSize'));
	
	$('#switcher button').click(function(){
		var num = parseInt($speech.css('fontSize'));
		
		switch(this.id) {
		case 'switcher-large':
			num *= 1.2;
			break;
		case 'switcher-small':
			num /= 1.2;
			break;
		default:
			num = defaultSize;
			break;
		}
		
		$speech.animate({fontSize : num+'px'}, 'slow');
		
	});	
});



$(function(){
	$('div.label').click(function(){
		var pWidth = $('div.speech p').outerWidth();
		var divWidth = $('#switcher').outerWidth();
		
		var num = parseInt(pWidth) - parseInt(divWidth);
		
		$('#switcher').fadeTo('fast', 0.5)
								.animate({marginLeft : num}, 'slow')
								.fadeTo('fast', 1.0)
								.slideUp('slow', function(){
									$(this).css('background', 'red');
								})
								.slideDown('slow');
		
	});	
});


$(function(){
	//2번째 p태그를 화면에서 숨김
	//a태그를 클릭 : slideUp + slideDown = slideToggle
	//read more => 클릭(화면에 데이터 출력) => read less
	//read less => 클릭(화면에 데이터 숨김) => read more
	//text(변경할 문자열), text() : 텍스트값을 뽑아오는 작업
	
	$('div.speech p').eq(1).hide();
	
	$('a.more').click(function(){
		$('div.speech p').eq(1).slideToggle('slow');
		
		var $link = $(this);
		if($link.text() == 'read more'){
			$link.text('read less');
		}else{
			$link.text('read more');
		}
	});
	
});




















