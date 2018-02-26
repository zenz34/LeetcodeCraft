function flip() {
    return Math.random() >= 0.5;
}

function randomNumber(n) {
    let size = 1;
    let num = n;
    let rand = 0;

    if (typeof n !== "number" || n < 0) {
        console.log(" Error: input wrong type! Please input positive integer number.");
    }

    if (n > 1000000) {
        throw new Error('Error: input is too large! Please input numbers not larger than 1000000!');
    }

    if (n <= 0) return rand;

    rand = Number.POSITIVE_INFINITY;

    while (rand >= n) {
        size = 1;
        rand = 0;

        while (Math.pow(2, size) < num) {
            size++;
            rand = rand * 2 + +flip();
        }
    }

    return rand;
}

// let x = 100;

// while (x--) {
//     console.log(randomNumber(500))
//     console.log(1);
//     console.log(0);
// }

// console.log(randomNumber(1))
// console.log(randomNumber(500))
// console.log(randomNumber(1000001))  // throw error  4086646746


