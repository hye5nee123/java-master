let year = 2024;
let month = 1;

class Calendar {
    constructor(year, month) {
        this.year = year;
        this.month = month;
    }
    days = ['Sun', 'Mon', 'Tue', 'Wed', 'Thr', 'Fri', 'Sat']

    makeCalendar() { //메소드
        this.makeTitle(document.getElementById('theader')); //make title과 make body를 호출.
        this.makeBody(document.getElementById('tbody')); //년도랑 월은 이미 속성에 담아놔서 필요없음. 삭제했음.
        console.log('달력생성')
    
    }
    makeTitle(pos) {
        let tr = document.createElement('tr'); //이하는  기능.
        this.days.forEach(function (field) { //
            let th = document.createElement('th');
            th.innerText = field;
            tr.appendChild(th);
        })
        pos.appendChild(tr);
    
    }
    makeBody(pos = {}) {
        let tr = document.createElement('tr');
        //공백.
        let firstDay = this.getFirstDay();
        for (let i = 0; i < firstDay; i++) {
            let td = document.createElement('td');
            td.innerText = "";
            tr.appendChild(td);
        }
    
        //날짜 출력
        let lastDate = this.getLastDate();
        for (let i = 1; i <= lastDate; i++) {
            //토요일: blue, 일요일:pink
            let td = document.createElement('td');
            td.innerText = i;
            tr.appendChild(td);
    
            if ((firstDay + i) % 7 == 0) {
                td.setAttribute('style', 'background-color: skyblue');
            } else if ((firstDay + i) % 7 == 1) {
                td.setAttribute('style', 'background-color: pink');
            }
    
            if ((firstDay + i) % 7 == 0) {
                pos.appendChild(tr);
                tr = document.createElement('tr');
            }
        }
        pos.appendChild(tr);
    } // end of makeBody
    
    getFirstDay() {
        return new Date(this.year, this.month - 1, 1).getDay();
    }
    getLastDate() {
        //년, 월 : this.year, this.month 사용
        return new Date(this.year, this.month, 0).getDate();
    }
}
const cal = new Calendar(year, month);

cal.makeCalendar();