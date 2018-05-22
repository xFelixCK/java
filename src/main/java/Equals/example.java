package Equals;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Objects;

public class example {
    //经典方式,这种17和31散列码的想法来自经典的Java书籍——《Effective Java》第九条
    public class User1 {
        private String name;
        private int age;
        private String passport;

        @Override
        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof User1)) {
                return false;
            }
            User1 user1 = (User1) o;
            return user1.name.equals(name) &&
                    user1.age == age &&
                    user1.passport.equals(passport);
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = 31 * result + name.hashCode();
            result = 31 * result + age;
            result = 31 * result + passport.hashCode();
            return result;
        }
    }

    //JDK 7 对于JDK7及更新版本，你可以是使用java.util.Objects 来重写 equals 和 hashCode 方法
    public class User2 {
        private String name;
        private int age;
        private String passport;

        @Override
        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof User1)) {
                return false;
            }
            User1 user1 = (User1) o;
            return user1.name.equals(name) &&
                    user1.age == age &&
                    user1.passport.equals(passport);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, passport);
        }
    }


    //Apache Commons Lang 或者,您可以使用Apache Commons LangEqualsBuilder 和HashCodeBuilder 方法。
    public class User3 {
        private String name;
        private int age;
        private String passport;

        @Override
        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof User3)) {
                return false;
            }
            User3 user = (User3) o;

            return new EqualsBuilder()
                    .append(age, user.age)
                    .append(name, user.name)
                    .append(passport, user.passport)
                    .isEquals();
        }

        @Override
        public int hashCode() {
            return new HashCodeBuilder(17, 31)
                    .append(name)
                    .append(age)
                    .append(passport)
                    .toHashCode();
        }
    }
    //其实后两种都是对于17和31散列码思想的封装实现。
}
