/**
 * service.js
 */
function makeLi(reply = {}) {
	console.log(reply)
	// start.
	let li = document.createElement('li');
	let span = document.createElement('span');
	span.innerText = '글번호:' + reply.replyNo;
	li.appendChild(span);
	span = document.createElement('span');
	span.innerText = ' ' + reply.reply;
	li.appendChild(span);
	span = document.createElement('span');
	span.innerText = ' ' + reply.name;
	li.appendChild(span);

	// 삭제버튼.
	let btn = document.createElement('button');
	btn.addEventListener('click', async function () {
	// ==btn.onclick = sync function(){
		//fetch함수.
		const promise = await fetch('delReplyJson.do?rno=' + reply.replyNo)
		const json = promise.json();
		try {

			//console.log(json)

			if (result.retCode == 'OK') {
				alert('처리성공');
				showList(pageInfo);
			} else if (result.retCode == 'NG') {
				alert('처리중 에러')
			}
		} catch (err) {
			console.log('예외=>',err)
		}
	}, true);
		


	btn.innerText = '삭제';
	li.appendChild(btn);  // end.

	return li;
}