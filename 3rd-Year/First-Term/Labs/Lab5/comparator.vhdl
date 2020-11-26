library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.STD_LOGIC_ARITH.ALL;
use IEEE.STD_LOGIC_UNSIGNED.ALL;

entity comparator is
    Port ( A : in  STD_LOGIC_VECTOR (1 downto 0);
           G,L,E : out  STD_LOGIC);
end comparator;

architecture Behavioral of comparator is

begin
process (A)
begin

G <= '0';
L <= '0';
E <= '0';
if (A(0) < A(1)) then
	L <= '1';

elsif (A(0) > A(1)) then
	G <= '1';

else
	E <= '1';
end if;
end process;
end Behavioral;
