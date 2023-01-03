// Bai 3: S = 1 + 1/2 + 1/3 + ... + 1/n

let n = 10;
let sum = 0;
for(let i = 1; i <= n; i++) {
    sum += 1.0/i;
}
console.log(sum);

// Output: 2.9289682539682538