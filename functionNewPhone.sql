delimiter //

drop function if exists lasabia.f_changePhone //

create function lasabia.f_changePhone(v_phone char(9), v_email varchar(40), domain varchar(40))
returns varchar(49)
deterministic
begin
	declare phone_email varchar(49) default "error";
    declare phoneNew char(9);
    declare emailNew varchar(40);
    
    set phoneNew = concat("55",mid(v_phone,3,length(v_phone)-2));
    
    set emailNew = lasabia.f_changeEmail(v_email, domain);
    
    set phone_email = concat(phoneNew, emailNew);
    
    return phone_email;

end //    
    