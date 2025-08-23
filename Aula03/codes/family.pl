% Fatos (base de conhecimento)
pai(joao, pedro).
pai(joao, maria).
pai(joao, ana).
mae(mariana, pedro).
mae(mariana, maria).
mae(ana, beatriz).

% Regra para definir se X é um irmão de Y
irmao(X, Y) :- pai(P, X), pai(P, Y), X \= Y.
irmao(X, Y) :- mae(M, X), mae(M, Y), X \= Y.

% Consulta: Quem são os irmãos de Maria?
% ?- irmao(maria, Quem).

