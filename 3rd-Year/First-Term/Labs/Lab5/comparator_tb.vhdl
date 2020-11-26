library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.STD_LOGIC_ARITH.ALL;
use IEEE.STD_LOGIC_UNSIGNED.ALL;

entity comparator_tb is
end entity;

architecture tb of comparator_tb is
component comparator is
Port ( A : in STD_LOGIC_VECTOR (1 downto 0);
G,L,E : out STD_LOGIC);
end component;

signal A : STD_LOGIC_VECTOR(1 downto 0);
signal G, L, E : STD_LOGIC;

begin

uut: comparator port map(
A => A, G => G,
L => L, E => E);

stim: process
begin

A <= "00";
wait for 1 ns;

A <= "01";
wait for 1 ns;

A <= "10";
wait for 1 ns;

A <= "11";
wait for 1 ns;
wait;

end process;
end tb;