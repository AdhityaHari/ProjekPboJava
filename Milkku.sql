PGDMP     "                     y            Milkku    14.1    14.1     ?           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            ?           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            ?           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            ?           1262    16394    Milkku    DATABASE     d   CREATE DATABASE "Milkku" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'English_India.1252';
    DROP DATABASE "Milkku";
                postgres    false            ?            1259    16425 	   pelanggan    TABLE       CREATE TABLE public.pelanggan (
    id smallint NOT NULL,
    username character varying(20) NOT NULL,
    password character varying(10) NOT NULL,
    nama character varying(50) NOT NULL,
    no_hp character varying(13) NOT NULL,
    alamat character varying NOT NULL
);
    DROP TABLE public.pelanggan;
       public         heap    postgres    false            ?            1259    16413    penjual    TABLE     ?   CREATE TABLE public.penjual (
    id smallint NOT NULL,
    username character varying NOT NULL,
    password character varying(10) NOT NULL
);
    DROP TABLE public.penjual;
       public         heap    postgres    false            ?            1259    16433    pesanan    TABLE     )  CREATE TABLE public.pesanan (
    id smallint NOT NULL,
    tanggal character varying NOT NULL,
    nama character varying(50) NOT NULL,
    jenis character varying(20) NOT NULL,
    jumlah integer NOT NULL,
    total_harga character varying(20) NOT NULL,
    alamat character varying NOT NULL
);
    DROP TABLE public.pesanan;
       public         heap    postgres    false            ?            1259    16430 
   stokproduk    TABLE     ?   CREATE TABLE public.stokproduk (
    id smallint NOT NULL,
    jenis character varying(20) NOT NULL,
    stok integer NOT NULL,
    harga_susu character varying(30) NOT NULL
);
    DROP TABLE public.stokproduk;
       public         heap    postgres    false            ?          0    16425 	   pelanggan 
   TABLE DATA           P   COPY public.pelanggan (id, username, password, nama, no_hp, alamat) FROM stdin;
    public          postgres    false    210   {       ?          0    16413    penjual 
   TABLE DATA           9   COPY public.penjual (id, username, password) FROM stdin;
    public          postgres    false    209          ?          0    16433    pesanan 
   TABLE DATA           X   COPY public.pesanan (id, tanggal, nama, jenis, jumlah, total_harga, alamat) FROM stdin;
    public          postgres    false    212   E       ?          0    16430 
   stokproduk 
   TABLE DATA           A   COPY public.stokproduk (id, jenis, stok, harga_susu) FROM stdin;
    public          postgres    false    211   ?       ?   ?   x?E???0Dg?+???IZV?!??0x??TJ??}L(0???쳂?r8i?	ڷ?u???3d?Dݾ??ɨa"?j?S?;)???;J3'$???Ҫ??]W?/????~?<??????????Z?[???y)?i??/h_3?      ?      x?3?tL??,?44261?????? ,??      ?   k   x?eͱ@0F??ާ????j???'JJ?????~?EJ?Jr-ZQ???\?S??y2d?jڬ?	?߸?????zk??/??`?a????U.-8"?/??\&?      ?   >   x?3?,.-.U(N,??45?44?300?2??f'?&e楃%L??P?ԔԜD??x? ?;     