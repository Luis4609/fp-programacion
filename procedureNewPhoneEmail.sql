delimiter //

drop procedure if exists lasabia.p_Practice //

create procedure lasabia.p_Practice(town varchar(30), domain varchar(40))
modifies sql data
begin

declare v_code char(4);
declare v_phone, newPhone char(9);
declare newPhone_Email varchar(49);
declare v_email, newEmail varchar(40);
declare fin boolean default 0;

declare centerTown cursor for
select c.codeCenter, c.phone, c.email
from lasabia.centers c
where c.town like town;

declare continue handler for not found set fin = 1;

open centerTown;

  vueltas:loop
   fetch centerTown into v_code, v_phone, v_email;

   if(fin) then leave vueltas;
   end if;
   
   set newPhone_Email = lasabia.f_changePhone(v_phone, v_email, domain);
   
   if(newPhone_Email != "error") then
     set newPhone = min(newPhone_Email,1,length(v_phone));
     set newEmail = min(newPhone_Email,length(v_phone)+1,length(newPhone_Email)-length(newPhone));
   
	update lasabia.centers set phone = newPhonw, email = newEmail where codeCenter like v_code;
    select concat("Updated", codeCenter);
   else
	select concat("Errros", codeCenter);
    leave vueltas;
   end if;
end loop vueltas;
    
    select "End Procedure";
    
end //

