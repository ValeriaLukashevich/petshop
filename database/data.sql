INSERT INTO public.color (id, color) VALUES (DEFAULT, 'black');
INSERT INTO public.color (id, color) VALUES (DEFAULT, 'white');
INSERT INTO public.color (id, color) VALUES (DEFAULT, 'brown');
INSERT INTO public.color (id, color) VALUES (DEFAULT, 'yellow');
INSERT INTO public.color (id, color) VALUES (DEFAULT, 'blue');

INSERT INTO public.country (id, name) VALUES (DEFAULT, 'Estonia');
INSERT INTO public.country (id, name) VALUES (DEFAULT, 'Latvia');
INSERT INTO public.country (id, name) VALUES (DEFAULT, 'Lithuania');
INSERT INTO public.country (id, name) VALUES (DEFAULT, 'Finland');
INSERT INTO public.country (id, name) VALUES (DEFAULT, 'Sweden');
INSERT INTO public.country (id, name) VALUES (DEFAULT, 'Norway');

INSERT INTO public.type (id, name) VALUES (DEFAULT, 'cat');
INSERT INTO public.type (id, name) VALUES (DEFAULT, 'dog');
INSERT INTO public.type (id, name) VALUES (DEFAULT, 'horse');
INSERT INTO public.type (id, name) VALUES (DEFAULT, 'rabbit');
INSERT INTO public.type (id, name) VALUES (DEFAULT, 'parrot');

INSERT INTO public."user" (id, name, password) VALUES (DEFAULT, 'valeria', '123');
INSERT INTO public."user" (id, name, password) VALUES (DEFAULT, 'mikk', '321');
INSERT INTO public."user" (id, name, password) VALUES (DEFAULT, 'bob', '231');

INSERT INTO public.pet (id, name, code, color_id, country_id, type_id, user_id) VALUES (DEFAULT, 'Mustikas', '202211151535', 1, 1, 1, 1);
INSERT INTO public.pet (id, name, code, color_id, country_id, type_id, user_id) VALUES (DEFAULT, 'Roy', '202211151536', 2, 2, 3, 2);
INSERT INTO public.pet (id, name, code, color_id, country_id, type_id, user_id) VALUES (DEFAULT, 'Charles', '202211151537', 3, 6, 2, 3);


