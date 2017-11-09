package Chapter7.Question1;

class Answer{
    Answer(){

    }
    // Solution
    /*
        P = Probability
        S = number of making shot
        s(k,n) =  number of making k shot out of n,

        -> probability of winning this game if player makes 2 'OR' 3 shot of 3
        P(win the game) = s(2,3) + s(3,3)

        -> Find the probability of making 3 shot  -> P1
         p ^ 3

        -> Find the probability of making exactly 2 shot ->  P2
        -> using permutation to find number of combination
        -> Let p = probability of making successful shot.

        P(1 and 2, miss 3) + P( 1 and 3, miss 2) +  P( 2 and 3, miss 3)
        =  p * p * (1 - p)   +      p * (1 - p) * p      +       (1 - p) * p * p
        = 3p ^ 2 - 2 p ^ 3

        Adding P1 and P2
        =  p ^ 3 + 3p ^ 2 - 2 p ^ 3
        =  3p ^ 2 - 2p ^ 3

        Play Game 1  if P (win game  1) > P (win game 2)
        p > 3p ^ 2 - 2p ^ 3
        2p ^ 2 - 3p + 1 > 0
        (2p - 1)(p - 1) > 0

        Got two probability (possible)
        p < 0.5 or p < 1


       if probability of making successful shot is less than 0.5 & larger than 0
       then we choose GAME 1
       otherwise GAME 1 and/or 2

     */
}