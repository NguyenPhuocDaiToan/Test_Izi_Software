// Bai 9: S = 1 . 2 . 3 ... n

let n = 10;
let mul = 1;
for(let i = 2; i <= n; i++) {
    mul *= i;
}
console.log(mul);
// Output: 3628800