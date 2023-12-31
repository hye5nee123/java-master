// dom1.js
        // [{id, name, phone}...]
        const obj1 = {id: 'user1', name: '홍길동', phone: '0101-1111'}
        const obj2 = {id: 'user2', name: '김민수', phone: '0101-2222'}
        const obj3 = {id: 'user3', name: '박철호', phone: '0101-2333'}
        const friends = [obj1, obj2, obj3];

        for (let friend of friends) {
            for (let key in friend) {
                console.log(key.toUpperCase(), ' - ', friend[key]); // obj1['id']
            }
        }
