library ieee;
use ieee.std_logic_1164.all;

entity task1tb is
end task1tb;

architecture arch of task1tb is

component task1
port(
a,b,c,d,e,f,g : in std_ulogic;
i,h : out std_ulogic

);

end component;

signal a,b,c,d,e,f,g,h,i: std_ulogic;
begin
tree: task1 port map (a=>a,b=>b,c=>c,d=>d,e=>e,f=>f,g=>g,h=>h,i=>i);

process
begin

a<='X';
b<='X';
c<='X';
d<='X';
e<='X';
f<='X';
g<='X';
wait for 1 ns;
a<='1';
b<='0';
c<='0';
d<='0';
e<='0';
f<='0';
g<='0';
wait for 1 ns;
a<='0';
b<='1';
c<='0';
d<='0';
e<='0';
f<='0';
g<='0';
wait for 1 ns;
a<='0';
b<='0';
c<='1';
d<='0';
e<='0';
f<='0';
g<='0';
wait for 1 ns;
a<='0';
b<='0';
c<='0';
d<='1';
e<='0';
f<='0';
g<='0';
wait for 1 ns;
a<='0';
b<='0';
c<='0';
d<='0';
e<='1';
f<='0';
g<='0';
wait for 1 ns;
a<='0';
b<='0';
c<='0';
d<='0';
e<='0';
f<='1';
g<='0';
wait for 1 ns;
a<='0';
b<='0';
c<='0';
d<='0';
e<='0';
f<='1';
g<='0';
wait for 1 ns;
assert false report "report end of text";
wait;
end process;
end arch;
