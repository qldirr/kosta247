$(function(){
	$('#selected-plays > li').addClass('horizontal');
	$('li:not(.horizontal)').addClass('sub-level');
	
	$('a[href $= pdf]').addClass('pdflink');
	$('a[href ^= mailto]').addClass('mailto');
	//$('a[href *= henry]:not(.mailto)').addClass('henrylink');
	$('a[href *= henry]').not('.mailto').addClass('henrylink');
	
	//$('tr:odd').addClass('alt');//짝수번째
	//$('tr:nth-child(odd)').addClass('alt');//홀수번째
	$('tr').filter(':odd').addClass('alt');// 짝수번째
	
	//$('td:contains(Henry)').addClass('highlight');
	//$('td:contains(Henry)').nextAll().andSelf().addClass('highlight');
	//$('td:contains(Henry)').parent().find('td').addClass('highlight');
	$('td:contains(Henry)').parent().find('td:eq(0)').addClass('highlight')
				.end().find('td:eq(1)').addClass('highlight');
	
	//each() => 해당 요소마다 각각의 작업을 수행
	//$('요소').each(function(index, item){
			//각 요소들의 작업을 수행 $(item)
   //})
	
   // $.each(배열, function(index, item){
	      //배열의 각 요소들의 작업을 수행 $(item)
   //})	
	
	
});











