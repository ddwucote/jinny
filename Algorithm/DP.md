부분 반복 문제 (Overlapping Subproblem)
- 반복적인 연산을 부분 반복 문제 (Overlapping Subproblem) 이라고 한다. 이는 어떤 문제가 여러 개의 부분 문제로 쪼개질 수 있을 때
  
최적 부분 구조 (Optimal Substructure)
- 작은 부분 문제에서 구한 최적의 답으로 합쳐진 큰 문제의 최적의 답을 구할 수 있어야 한다는 것

+ Memoization DP에 도입
- > 메모리에 계산한 값을 저장해 나감으로써 반복 수행될 때 연산 없이 저장된 값을 사용한다는 개념이다


Bottom - up : 아래서 위로 접근하는 방법으로 부분 문제에서부터 문제를 해결
Top - down : 위에서 아래로 접근하는 방법으로, 큰 문제에서 부분 문제로 쪼개가면서 재귀 호출을 통해 문제를 푸는 방법

TOP-DOWN

int fiboData[100] = {0,};

int fibo(int n)
{
  if (n<=2) 
    return 1;
  if (fiboData[n]==0)
    fiboData[n] = fibo(n-1) + fibo(n-2);
  return fiboData[n];
} -> 메모이제이션

BOTTOM-UP
int fibo(int n)
{
  fibodata[0] = 0;
  fiboData[1] = 1;
  for (int i=2; i<=n; i++)
    fiboData[i] = fiboData[i - 1] + fiboData[i - 2];
  return fiboData[n];
}
처음 값부터 계산해 최종 값까지 계산: BOTTOM-UP 
