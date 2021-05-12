-- select insert("", 1,2, "") into variable 

set @email = concat(left("texto", instr("mismotexto", '@')), "toReplace");
select @email;

set @todo = concat(substring("", 1, locate('@', "")), "pito.com");
select @todo;
set @phone = replace("9134554", substr("mismoNumero", 1,2), "55");
select @phone; 