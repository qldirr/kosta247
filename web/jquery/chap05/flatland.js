$(function(){
	//1. id=footer 앞에 ol태그를 생성하세요
	$('<ol id="notes"></ol>').insertBefore("#footer");
	
	//2. span 앞에 [1][2][3] 만들기
	//3. <span> =>  ol 안에 넣기
	$('span.footnote').each(function(index){
		$(this).before('<a id="context-' + (index+1)  +  '">[' + (index+1)  + ']</a>')
			.appendTo('#notes')
			.append('&nbsp;<a href="#context-' + (index+1) + '">context-' + (index+1) + '</a>')
			.wrap('<li></li>');
	});
});
