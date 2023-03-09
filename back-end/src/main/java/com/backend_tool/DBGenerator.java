package com.backend_tool;

import com.backend.entity.Category;
import com.backend.entity.HoaDon;
import com.backend.entity.HoaDonChiTiet;
import com.backend.entity.Product;
import com.backend.entity.User;
import com.backend.infrastructure.constant.HoaDonConstant;
import com.backend.repository.CategoryRepository;
import com.backend.repository.HoaDonChiTietRepository;
import com.backend.repository.HoaDonRepository;
import com.backend.repository.ProductRepository;
import com.backend.repository.UserRepository;
import com.backend.util.DateTimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(
        basePackages = "com.backend.repository"
)
public class DBGenerator implements CommandLineRunner {

    @Autowired
    private HoaDonRepository hoaDonRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private HoaDonChiTietRepository hoaDonChiTietRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        // user
        User user = new User();
        user.setHoTen("Nguyễn Văn A");
        user.setDia_chi("Hà Nội");
        user.setMatKhau("1");
        user.setSoDu(10000L);
        user.setTenTaiKhoan("nguyenVanA");
        user.setId( userRepository.save(user).getId());

        User user1 = new User();
        user1.setHoTen("Nguyễn Văn B");
        user1.setDia_chi("Hà Nội");
        user1.setMatKhau("1");
        user1.setSoDu(10000L);
        user1.setTenTaiKhoan("nguyenVanB");
        user1.setId( userRepository.save(user1).getId());

        User user2 = new User();
        user2.setHoTen("Nguyễn Văn C");
        user2.setDia_chi("Hà Nội");
        user2.setMatKhau("1");
        user2.setSoDu(10000L);
        user2.setTenTaiKhoan("nguyenVanC");
        user2.setId( userRepository.save(user2).getId());

        // category
        Category category = new Category();
        category.setMaTheLoai("TL0001");
        category.setTenTheLoai("Thể loại A");
        category.setId(categoryRepository.save(category).getId());


        Category category1 = new Category();
        category1.setMaTheLoai("TL0002");
        category1.setTenTheLoai("Thể loại B");
        category1.setId(categoryRepository.save(category1).getId());

        Category category2 = new Category();
        category2.setMaTheLoai("TL0003");
        category2.setTenTheLoai("Thể loại C");
        category2.setId(categoryRepository.save(category2).getId());

        // product
        Product product = new Product();
        product.setGia(1000L);
        product.setMaSP("SP0001");
        product.setTenSP("Sản phẩm A");
        product.setTheLoaiId(category.getId());
        product.setId(productRepository.save(product).getId());

        Product product1 = new Product();
        product1.setGia(1000L);
        product1.setMaSP("SP0002");
        product1.setTenSP("Sản phẩm B");
        product1.setTheLoaiId(category.getId());
        product1.setId(productRepository.save(product1).getId());

        Product product2 = new Product();
        product2.setGia(1000L);
        product2.setMaSP("SP0003");
        product2.setTenSP("Sản phẩm C");
        product2.setTheLoaiId(category.getId());
        product2.setId(productRepository.save(product2).getId());

        Product product3 = new Product();
        product3.setGia(1000L);
        product3.setMaSP("SP0004");
        product3.setTenSP("Sản phẩm D");
        product3.setTheLoaiId(category1.getId());
        product3.setId(productRepository.save(product3).getId());

        Product product4 = new Product();
        product4.setGia(1000L);
        product4.setMaSP("SP0005");
        product4.setTenSP("Sản phẩm E");
        product4.setTheLoaiId(category1.getId());
        product4.setId(productRepository.save(product4).getId());

        Product product5 = new Product();
        product5.setGia(1000L);
        product5.setMaSP("SP0006");
        product5.setTenSP("Sản phẩm F");
        product5.setTheLoaiId(category1.getId());
        product5.setId(productRepository.save(product5).getId());

        Product product6 = new Product();
        product6.setGia(1000L);
        product6.setMaSP("SP0007");
        product6.setTenSP("Sản phẩm G");
        product6.setTheLoaiId(category2.getId());
        product6.setId(productRepository.save(product6).getId());

        Product product7 = new Product();
        product7.setGia(1000L);
        product7.setMaSP("SP0008");
        product7.setTenSP("Sản phẩm U");
        product7.setTheLoaiId(category2.getId());
        product7.setId(productRepository.save(product7).getId());

        Product product8 = new Product();
        product8.setGia(1000L);
        product8.setMaSP("SP0009");
        product8.setTenSP("Sản phẩm N");
        product8.setTheLoaiId(category1.getId());
        product8.setId(productRepository.save(product8).getId());

        Product product9 = new Product();
        product9.setGia(1000L);
        product9.setMaSP("SP00010");
        product9.setTenSP("Sản phẩm M");
        product9.setTheLoaiId(category2.getId());
        product9.setId(productRepository.save(product9).getId());

        Product product10 = new Product();
        product10.setGia(1000L);
        product10.setMaSP("SP0011");
        product10.setTenSP("Sản phẩm S");
        product10.setTheLoaiId(category.getId());
        product10.setId(productRepository.save(product10).getId());

        HoaDon hoaDon = new HoaDon();
        hoaDon.setMaHoaDon("HD"+ DateTimeUtil.convertDateToTimeStampSecond());
        hoaDon.setKhachHangId(user.getId());
        hoaDon.setHoaDonConstant(HoaDonConstant.CHO_THANH_TOAN);
        hoaDon.setId(hoaDonRepository.save(hoaDon).getId());

        HoaDon hoaDon1 = new HoaDon();
        hoaDon1.setMaHoaDon("HD"+ DateTimeUtil.convertDateToTimeStampSecond());
        hoaDon1.setKhachHangId(user.getId());
        hoaDon1.setHoaDonConstant(HoaDonConstant.DA_THANH_TOAN);
        hoaDon1.setId(hoaDonRepository.save(hoaDon1).getId());

        HoaDonChiTiet hoaDonChiTiet = new HoaDonChiTiet();
        hoaDonChiTiet.setHoaDonId(hoaDon.getId());
        hoaDonChiTiet.setProductId(product.getId());
        hoaDonChiTiet.setDonGia(product.getGia());
        hoaDonChiTiet.setSoLuong(2L);
        hoaDonChiTietRepository.save(hoaDonChiTiet);

        HoaDonChiTiet hoaDonChiTiet1 = new HoaDonChiTiet();
        hoaDonChiTiet1.setHoaDonId(hoaDon.getId());
        hoaDonChiTiet1.setProductId(product1.getId());
        hoaDonChiTiet1.setDonGia(product1.getGia());
        hoaDonChiTiet1.setSoLuong(2L);
        hoaDonChiTietRepository.save(hoaDonChiTiet1);

        HoaDonChiTiet hoaDonChiTiet2 = new HoaDonChiTiet();
        hoaDonChiTiet2.setHoaDonId(hoaDon.getId());
        hoaDonChiTiet2.setProductId(product2.getId());
        hoaDonChiTiet2.setDonGia(product2.getGia());
        hoaDonChiTiet2.setSoLuong(2L);
        hoaDonChiTietRepository.save(hoaDonChiTiet2);


        HoaDonChiTiet hoaDonChiTiet3 = new HoaDonChiTiet();
        hoaDonChiTiet3.setHoaDonId(hoaDon1.getId());
        hoaDonChiTiet3.setProductId(product.getId());
        hoaDonChiTiet3.setDonGia(product.getGia());
        hoaDonChiTiet3.setSoLuong(2L);
        hoaDonChiTietRepository.save(hoaDonChiTiet3);

        HoaDonChiTiet hoaDonChiTiet4 = new HoaDonChiTiet();
        hoaDonChiTiet4.setHoaDonId(hoaDon1.getId());
        hoaDonChiTiet4.setProductId(product1.getId());
        hoaDonChiTiet4.setDonGia(product1.getGia());
        hoaDonChiTiet4.setSoLuong(2L);
        hoaDonChiTietRepository.save(hoaDonChiTiet4);

        HoaDonChiTiet hoaDonChiTiet5 = new HoaDonChiTiet();
        hoaDonChiTiet5.setHoaDonId(hoaDon1.getId());
        hoaDonChiTiet5.setProductId(product2.getId());
        hoaDonChiTiet5.setDonGia(product2.getGia());
        hoaDonChiTiet5.setSoLuong(2L);
        hoaDonChiTietRepository.save(hoaDonChiTiet5);
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DBGenerator.class);
        ctx.close();
    }
}
