delimiter //

drop function if exists lasabia.f_changeEmail //

create function lasabia.f_changeEmail(v_email varchar(40), domain varchar(40))
returns varchar(40)
deterministic
begin
	declare emailNew varchar(40);
    declare domainNew varchar(40) default domain;
    declare positionAt int;
    
    set positionAt = instr(v_email, "@");
    -- replace posible solution with the function replace
    set emailNew = concat(mid(v_email, 1, positionAt), domain);
	
    return emailNew;

end //    