delimiter //

drop procedure if exists lasabia.p_DateProcedure //

create procedure lasabia.p_DateProcedure(fecha date)
modifies sql data
begin
-- Declarar variables necesarias para el procedure
declare studentCode char(4);
declare studentName varchar(30);
declare studentDateOfBirth date;
declare differenceDates date;

-- Declarar variable para finalizar el bucle, para recorrer el cursor
declare fin boolean default 0;

-- Declarar el cursor para encontrar las fechas menores al valor pasado por parametro
-- Buscar los datos(code, name and dateOfBirth) 
declare datesStudents cursor for
select codeStudent, nameStudent, dateOfBirth
from lasabia.students 
where dateOfBirth < fecha;

declare continue handler for not found set fin = 1;
-- Abrir eñ cursor
open datesStudents;

  vueltas:loop
  -- Fetch al cursor
   fetch datesStudents into studentCode, studentName, studentDateOfBirth;

   if(fin) then leave vueltas;
   end if;
   -- LLamar a la funcion para calcular la diferencia en las fechas
   set differenceDates = lasabia.f_calculateDates(studentDateOfBirth, fecha);
   
   -- 
   if(differenceDates > 50) then
	select studentCode, studentName, studentDateOfBirth from datesStudents;
    
    leave vueltas;
   end if;
end loop vueltas;
    
    select "End Procedure";
    
end //

